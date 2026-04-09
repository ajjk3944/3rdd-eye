.class final Lcom/google/android/gms/oss/licenses/n;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;


# direct methods
.method constructor <init>(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/content/Context;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/n;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/oss/licenses/b;->d(Lcom/google/android/gms/oss/licenses/a;)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/b;->e(Lcom/google/android/gms/oss/licenses/a;)I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2, v0, p1, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/oss/licenses/n;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/n;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/oss/licenses/a;->a:Landroid/content/res/Resources;

    invoke-static {v0}, Lcom/google/android/gms/oss/licenses/b;->d(Lcom/google/android/gms/oss/licenses/a;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/oss/licenses/n;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p3}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/oss/licenses/b;->e(Lcom/google/android/gms/oss/licenses/a;)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-interface {p0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG3/e;

    invoke-virtual {p1}, LG3/e;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
