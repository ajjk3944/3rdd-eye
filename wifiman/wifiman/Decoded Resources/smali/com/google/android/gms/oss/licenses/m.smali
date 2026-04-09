.class final Lcom/google/android/gms/oss/licenses/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field final synthetic a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;


# direct methods
.method constructor <init>(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p1, v0}, Lcom/google/android/gms/oss/licenses/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Z0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Lcom/google/android/gms/oss/licenses/a;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {v1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object v1

    iget-object v2, v1, Lcom/google/android/gms/oss/licenses/a;->a:Landroid/content/res/Resources;

    iget-object v1, v1, Lcom/google/android/gms/oss/licenses/a;->b:Ljava/lang/String;

    const-string v3, "libraries_social_licenses_license_menu_activity"

    const-string v4, "layout"

    invoke-virtual {v2, v3, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/oss/licenses/a;->a:Landroid/content/res/Resources;

    iget-object v0, v0, Lcom/google/android/gms/oss/licenses/a;->b:Ljava/lang/String;

    const-string v2, "license_list"

    const-string v3, "id"

    invoke-virtual {v1, v2, v3, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    invoke-static {p1, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->b1(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/widget/ListView;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    new-instance v0, Lcom/google/android/gms/oss/licenses/n;

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/oss/licenses/n;-><init>(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->a1(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/widget/ArrayAdapter;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->X0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->W0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Landroid/widget/ArrayAdapter;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/m;->a:Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;

    invoke-static {p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->X0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Landroid/widget/ListView;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/oss/licenses/l;

    invoke-direct {v0, p0}, Lcom/google/android/gms/oss/licenses/l;-><init>(Lcom/google/android/gms/oss/licenses/m;)V

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_2
    return-void
.end method
