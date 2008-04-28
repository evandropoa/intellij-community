package com.intellij.lang.dtd;

import com.intellij.ide.highlighter.XmlFileHighlighter;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: max
 * Date: Jan 24, 2005
 * Time: 10:53:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class DTDLanguage extends Language {

  public static final DTDLanguage INSTANCE = new DTDLanguage();

  protected DTDLanguage() {
    super("DTD", "text/dtd", "text/x-dtd");
    SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
      @NotNull
      protected SyntaxHighlighter createHighlighter() {
        return new XmlFileHighlighter(true);
      }
    });
  }
}
