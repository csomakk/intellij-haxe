// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeForStatement extends HaxeForStatementPsiMixin {

  @NotNull
  List<HaxeBlockStatement> getBlockStatementList();

  @NotNull
  List<HaxeBreakStatement> getBreakStatementList();

  @Nullable
  HaxeComponentName getComponentName();

  @NotNull
  List<HaxeContinueStatement> getContinueStatementList();

  @NotNull
  List<HaxeDoWhileStatement> getDoWhileStatementList();

  @NotNull
  List<HaxeExpression> getExpressionList();

  @NotNull
  List<HaxeForStatement> getForStatementList();

  @NotNull
  List<HaxeIfStatement> getIfStatementList();

  @Nullable
  HaxeIterable getIterable();

  @NotNull
  List<HaxeLocalFunctionDeclaration> getLocalFunctionDeclarationList();

  @NotNull
  List<HaxeLocalVarDeclaration> getLocalVarDeclarationList();

  @NotNull
  List<HaxeMacroClassList> getMacroClassListList();

  @NotNull
  List<HaxeReturnStatement> getReturnStatementList();

  @NotNull
  List<HaxeSwitchStatement> getSwitchStatementList();

  @NotNull
  List<HaxeThrowStatement> getThrowStatementList();

  @NotNull
  List<HaxeTryStatement> getTryStatementList();

  @NotNull
  List<HaxeWhileStatement> getWhileStatementList();

}
