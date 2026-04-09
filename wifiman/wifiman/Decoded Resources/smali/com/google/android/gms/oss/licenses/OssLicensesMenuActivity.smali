.class public final Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"

# interfaces
.implements Landroidx/loader/app/a$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/appcompat/app/c;",
        "Landroidx/loader/app/a$a;"
    }
.end annotation


# static fields
.field private static J:Ljava/lang/String;


# instance fields
.field private D:Landroid/widget/ListView;

.field private E:Landroid/widget/ArrayAdapter;

.field private F:Z

.field private G:Lcom/google/android/gms/oss/licenses/a;

.field private H:Lcom/google/android/gms/tasks/Task;

.field private I:Lcom/google/android/gms/oss/licenses/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static T0(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v2, LK3/a;->a:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "raw"

    invoke-virtual {p0, p1, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return v1

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    throw p0

    :catch_2
    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_2
    return v1
.end method

.method public static V0(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->J:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic W0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Landroid/widget/ArrayAdapter;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    return-object p0
.end method

.method static bridge synthetic X0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Landroid/widget/ListView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->D:Landroid/widget/ListView;

    return-object p0
.end method

.method static bridge synthetic Y0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)Lcom/google/android/gms/oss/licenses/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->G:Lcom/google/android/gms/oss/licenses/a;

    return-object p0
.end method

.method static bridge synthetic Z0(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Lcom/google/android/gms/oss/licenses/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->G:Lcom/google/android/gms/oss/licenses/a;

    return-void
.end method

.method static bridge synthetic a1(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/widget/ArrayAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    return-void
.end method

.method static bridge synthetic b1(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Landroid/widget/ListView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->D:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final bridge synthetic F(Le2/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->U0(Le2/b;Ljava/util/List;)V

    return-void
.end method

.method public U0(Le2/b;Ljava/util/List;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public n(ILandroid/os/Bundle;)Le2/b;
    .locals 0

    iget-boolean p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->F:Z

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/oss/licenses/k;

    invoke-static {p0}, Lcom/google/android/gms/oss/licenses/b;->b(Landroid/content/Context;)Lcom/google/android/gms/oss/licenses/b;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/oss/licenses/k;-><init>(Landroid/content/Context;Lcom/google/android/gms/oss/licenses/b;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/j;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/google/android/gms/oss/licenses/b;->b(Landroid/content/Context;)Lcom/google/android/gms/oss/licenses/b;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->I:Lcom/google/android/gms/oss/licenses/b;

    const-string p1, "third_party_licenses"

    invoke-static {p0, p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->T0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const-string p1, "third_party_license_metadata"

    invoke-static {p0, p1}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->T0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->F:Z

    sget-object p1, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->J:Ljava/lang/String;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->J:Ljava/lang/String;

    const-string p1, "OssLicensesMenuActivity"

    const-string v0, "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object p1, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->J:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a;->s(Z)V

    :cond_3
    iget-boolean p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->F:Z

    if-eqz p1, :cond_4

    invoke-static {p0}, Lcom/google/android/gms/oss/licenses/b;->b(Landroid/content/Context;)Lcom/google/android/gms/oss/licenses/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/oss/licenses/b;->c()Lcom/google/android/gms/oss/licenses/j;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/oss/licenses/g;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/oss/licenses/g;-><init>(Lcom/google/android/gms/oss/licenses/j;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/d;->g(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->H:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p0}, Landroidx/fragment/app/j;->w0()Landroidx/loader/app/a;

    move-result-object p1

    const v0, 0xd431

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Landroidx/loader/app/a;->d(ILandroid/os/Bundle;Landroidx/loader/app/a$a;)Le2/b;

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->H:Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lcom/google/android/gms/oss/licenses/m;

    invoke-direct {v0, p0}, Lcom/google/android/gms/oss/licenses/m;-><init>(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_4
    sget p1, LK3/b;->b:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/j;->w0()Landroidx/loader/app/a;

    move-result-object v0

    const v1, 0xd431

    invoke-virtual {v0, v1}, Landroidx/loader/app/a;->a(I)V

    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public p(Le2/b;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->E:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method
