/*
* generated by Xtext
*/
grammar InternalLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package hu.bme.mit.kk.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package hu.bme.mit.kk.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.kk.dsl.services.LanguageGrammarAccess;

}

@parser::members {
 
 	private LanguageGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariable
entryRuleVariable 
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableAccess().getNameAssignment()); }
(rule__Variable__NameAssignment)
{ after(grammarAccess.getVariableAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStatement
entryRuleStatement 
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStatementAccess().getGroup()); }
(rule__Statement__Group__0)
{ after(grammarAccess.getStatementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpression
entryRuleExpression 
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionAccess().getIffParserRuleCall()); }
	ruleIff
{ after(grammarAccess.getExpressionAccess().getIffParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIff
entryRuleIff 
:
{ before(grammarAccess.getIffRule()); }
	 ruleIff
{ after(grammarAccess.getIffRule()); } 
	 EOF 
;

// Rule Iff
ruleIff
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIffAccess().getGroup()); }
(rule__Iff__Group__0)
{ after(grammarAccess.getIffAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOr
entryRuleOr 
:
{ before(grammarAccess.getOrRule()); }
	 ruleOr
{ after(grammarAccess.getOrRule()); } 
	 EOF 
;

// Rule Or
ruleOr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOrAccess().getGroup()); }
(rule__Or__Group__0)
{ after(grammarAccess.getOrAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAnd
entryRuleAnd 
:
{ before(grammarAccess.getAndRule()); }
	 ruleAnd
{ after(grammarAccess.getAndRule()); } 
	 EOF 
;

// Rule And
ruleAnd
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAndAccess().getGroup()); }
(rule__And__Group__0)
{ after(grammarAccess.getAndAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNegation
entryRuleNegation 
:
{ before(grammarAccess.getNegationRule()); }
	 ruleNegation
{ after(grammarAccess.getNegationRule()); } 
	 EOF 
;

// Rule Negation
ruleNegation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNegationAccess().getAlternatives()); }
(rule__Negation__Alternatives)
{ after(grammarAccess.getNegationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePrimary
entryRulePrimary 
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
(rule__Primary__Alternatives)
{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariableReference
entryRuleVariableReference 
:
{ before(grammarAccess.getVariableReferenceRule()); }
	 ruleVariableReference
{ after(grammarAccess.getVariableReferenceRule()); } 
	 EOF 
;

// Rule VariableReference
ruleVariableReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableReferenceAccess().getGroup()); }
(rule__VariableReference__Group__0)
{ after(grammarAccess.getVariableReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Negation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getGroup_0()); }
(rule__Negation__Group_0__0)
{ after(grammarAccess.getNegationAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getNegationAccess().getPrimaryParserRuleCall_1()); }
	rulePrimary
{ after(grammarAccess.getNegationAccess().getPrimaryParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_0()); }
	ruleVariableReference
{ after(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
(rule__Primary__Group_1__0)
{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVariablesAssignment_0()); }
(rule__Model__VariablesAssignment_0)
{ after(grammarAccess.getModelAccess().getVariablesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGroup_1()); }
(rule__Model__Group_1__0)*
{ after(grammarAccess.getModelAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
(rule__Model__StatementsAssignment_2)
{ after(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
)
(
{ before(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
(rule__Model__StatementsAssignment_2)*
{ after(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Model__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__0__Impl
	rule__Model__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getCommaKeyword_1_0()); }

	',' 

{ after(grammarAccess.getModelAccess().getCommaKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVariablesAssignment_1_1()); }
(rule__Model__VariablesAssignment_1_1)
{ after(grammarAccess.getModelAccess().getVariablesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Statement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statement__Group__0__Impl
	rule__Statement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getVariableAssignment_0()); }
(rule__Statement__VariableAssignment_0)
{ after(grammarAccess.getStatementAccess().getVariableAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statement__Group__1__Impl
	rule__Statement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getStatementAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getExpressionAssignment_2()); }
(rule__Statement__ExpressionAssignment_2)
{ after(grammarAccess.getStatementAccess().getExpressionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Iff__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Iff__Group__0__Impl
	rule__Iff__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getOrParserRuleCall_0()); }
	ruleOr
{ after(grammarAccess.getIffAccess().getOrParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Iff__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Iff__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getGroup_1()); }
(rule__Iff__Group_1__0)?
{ after(grammarAccess.getIffAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Iff__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Iff__Group_1__0__Impl
	rule__Iff__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getIffLeftAction_1_0()); }
(

)
{ after(grammarAccess.getIffAccess().getIffLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Iff__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Iff__Group_1__1__Impl
	rule__Iff__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getEqualsSignEqualsSignKeyword_1_1()); }

	'==' 

{ after(grammarAccess.getIffAccess().getEqualsSignEqualsSignKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Iff__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Iff__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getRightAssignment_1_2()); }
(rule__Iff__RightAssignment_1_2)
{ after(grammarAccess.getIffAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Or__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Or__Group__0__Impl
	rule__Or__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
	ruleAnd
{ after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Or__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getGroup_1()); }
(rule__Or__Group_1__0)*
{ after(grammarAccess.getOrAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Or__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Or__Group_1__0__Impl
	rule__Or__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
(

)
{ after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Or__Group_1__1__Impl
	rule__Or__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); }

	'||' 

{ after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Or__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Or__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Or__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
(rule__Or__RightAssignment_1_2)
{ after(grammarAccess.getOrAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__And__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__And__Group__0__Impl
	rule__And__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getNegationParserRuleCall_0()); }
	ruleNegation
{ after(grammarAccess.getAndAccess().getNegationParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__And__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getGroup_1()); }
(rule__And__Group_1__0)*
{ after(grammarAccess.getAndAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__And__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__And__Group_1__0__Impl
	rule__And__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
(

)
{ after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__And__Group_1__1__Impl
	rule__And__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); }

	'&&' 

{ after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__And__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
(rule__And__RightAssignment_1_2)
{ after(grammarAccess.getAndAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Negation__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Negation__Group_0__0__Impl
	rule__Negation__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0_0()); }

	'!' 

{ after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Negation__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Negation__Group_0__1__Impl
	rule__Negation__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getNegationAction_0_1()); }
(

)
{ after(grammarAccess.getNegationAccess().getNegationAction_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Negation__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Negation__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getValueAssignment_0_2()); }
(rule__Negation__ValueAssignment_0_2)
{ after(grammarAccess.getNegationAccess().getValueAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Primary__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }

	'(' 

{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Primary__Group_1__1__Impl
	rule__Primary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimaryAccess().getOrParserRuleCall_1_1()); }
	ruleOr
{ after(grammarAccess.getPrimaryAccess().getOrParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Primary__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }

	')' 

{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VariableReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableReference__Group__0__Impl
	rule__VariableReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0()); }
(

)
{ after(grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableReferenceAccess().getValueAssignment_1()); }
(rule__VariableReference__ValueAssignment_1)
{ after(grammarAccess.getVariableReferenceAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__VariablesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_0_0()); }
	ruleVariable{ after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__VariablesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_1_1_0()); }
	ruleVariable{ after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__StatementsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); }
	ruleStatement{ after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__VariableAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getVariableVariableCrossReference_0_0()); }
(
{ before(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getStatementAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getStatementAccess().getVariableVariableCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__ExpressionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_2_0()); }
	ruleExpression{ after(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Iff__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIffAccess().getRightOrParserRuleCall_1_2_0()); }
	ruleOr{ after(grammarAccess.getIffAccess().getRightOrParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Or__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
	ruleAnd{ after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__And__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAndAccess().getRightNegationParserRuleCall_1_2_0()); }
	ruleNegation{ after(grammarAccess.getAndAccess().getRightNegationParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__ValueAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getValuePrimaryParserRuleCall_0_2_0()); }
	rulePrimary{ after(grammarAccess.getNegationAccess().getValuePrimaryParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableReference__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableReferenceAccess().getValueVariableCrossReference_1_0()); }
(
{ before(grammarAccess.getVariableReferenceAccess().getValueVariableIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getVariableReferenceAccess().getValueVariableIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getVariableReferenceAccess().getValueVariableCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


