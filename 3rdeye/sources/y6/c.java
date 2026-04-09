package y6;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.kt */
/* loaded from: classes.dex */
public class c extends Resources {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f48196a;

    public c(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f48196a = resources;
    }

    @Override // android.content.res.Resources
    public final void addLoaders(ResourcesLoader... loaders) {
        l.f(loaders, "loaders");
        this.f48196a.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        XmlResourceParser animation = this.f48196a.getAnimation(i);
        l.e(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) throws Resources.NotFoundException {
        return this.f48196a.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f48196a.getColorStateList(i, theme);
        l.e(colorStateList, "resources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        return this.f48196a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return this.f48196a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f48196a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i10) throws Resources.NotFoundException {
        return this.f48196a.getDrawableForDensity(i, i10);
    }

    @Override // android.content.res.Resources
    public final float getFloat(int i) throws Resources.NotFoundException {
        return this.f48196a.getFloat(i);
    }

    @Override // android.content.res.Resources
    public final Typeface getFont(int i) throws Resources.NotFoundException {
        Typeface font = this.f48196a.getFont(i);
        l.e(font, "resources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i10, int i11) throws Resources.NotFoundException {
        return this.f48196a.getFraction(i, i10, i11);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.f48196a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) throws Resources.NotFoundException {
        int[] intArray = this.f48196a.getIntArray(i);
        l.e(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        XmlResourceParser layout = this.f48196a.getLayout(i);
        l.e(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) throws Resources.NotFoundException {
        return this.f48196a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i10, Object... formatArgs) throws Resources.NotFoundException {
        l.f(formatArgs, "formatArgs");
        String quantityString = this.f48196a.getQuantityString(i, i10, Arrays.copyOf(formatArgs, formatArgs.length));
        l.e(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i10) throws Resources.NotFoundException {
        CharSequence quantityText = this.f48196a.getQuantityText(i, i10);
        l.e(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.f48196a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) throws Resources.NotFoundException {
        return this.f48196a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.f48196a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.f48196a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... formatArgs) throws Resources.NotFoundException {
        l.f(formatArgs, "formatArgs");
        String string = this.f48196a.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        l.e(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) throws Resources.NotFoundException {
        String[] stringArray = this.f48196a.getStringArray(i);
        l.e(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.f48196a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        CharSequence[] textArray = this.f48196a.getTextArray(i);
        l.e(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f48196a.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f48196a.getValueForDensity(i, i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f48196a.getXml(i);
        l.e(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f48196a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = this.f48196a.obtainTypedArray(i);
        l.e(typedArrayObtainTypedArray, "resources.obtainTypedArray(id)");
        return typedArrayObtainTypedArray;
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = this.f48196a.openRawResource(i, typedValue);
        l.e(inputStreamOpenRawResource, "resources.openRawResource(id, value)");
        return inputStreamOpenRawResource;
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.f48196a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f48196a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f48196a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void removeLoaders(ResourcesLoader... loaders) {
        l.f(loaders, "loaders");
        this.f48196a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f48196a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public final int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f48196a.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f48196a.getColorStateList(i);
        l.e(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.f48196a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i10, Resources.Theme theme) {
        return this.f48196a.getDrawableForDensity(i, i10, theme);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i10) throws Resources.NotFoundException {
        String quantityString = this.f48196a.getQuantityString(i, i10);
        l.e(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final String getString(int i) throws Resources.NotFoundException {
        String string = this.f48196a.getString(i);
        l.e(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) throws Resources.NotFoundException {
        CharSequence text = this.f48196a.getText(i);
        l.e(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f48196a.getValue(i, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = this.f48196a.openRawResource(i);
        l.e(inputStreamOpenRawResource, "resources.openRawResource(id)");
        return inputStreamOpenRawResource;
    }
}
