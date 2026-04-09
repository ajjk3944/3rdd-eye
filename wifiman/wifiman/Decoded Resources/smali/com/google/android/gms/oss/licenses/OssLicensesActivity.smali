.class public final Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# instance fields
.field private D:LG3/e;

.field private E:Ljava/lang/String;

.field private F:Landroid/widget/ScrollView;

.field private G:Landroid/widget/TextView;

.field private H:I

.field private I:Lcom/google/android/gms/tasks/Task;

.field private J:Lcom/google/android/gms/tasks/Task;

.field private N:Lcom/google/android/gms/oss/licenses/b;

.field X:Lcom/google/android/gms/oss/licenses/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Landroid/widget/TextView;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->H:I

    return-void
.end method

.method static bridge synthetic T0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->H:I

    return p0
.end method

.method static bridge synthetic U0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Landroid/widget/ScrollView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Landroid/widget/ScrollView;

    return-object p0
.end method

.method static bridge synthetic V0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Landroid/widget/TextView;

    return-object p0
.end method

.method static bridge synthetic W0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->J:Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method static bridge synthetic X0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->I:Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method static bridge synthetic Y0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)LG3/e;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->D:LG3/e;

    return-object p0
.end method

.method static bridge synthetic Z0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic a1(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic b1(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;Landroid/widget/ScrollView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Landroid/widget/ScrollView;

    return-void
.end method

.method static bridge synthetic c1(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/j;->onCreate(Landroid/os/Bundle;)V

    sget p1, LK3/b;->a:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-static {p0}, Lcom/google/android/gms/oss/licenses/b;->b(Landroid/content/Context;)Lcom/google/android/gms/oss/licenses/b;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->N:Lcom/google/android/gms/oss/licenses/b;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "license"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, LG3/e;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->D:LG3/e;

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->D:LG3/e;

    invoke-virtual {v0}, LG3/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->w(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->t(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->s(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->H0()Landroidx/appcompat/app/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->u(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->N:Lcom/google/android/gms/oss/licenses/b;

    invoke-virtual {v0}, Lcom/google/android/gms/oss/licenses/b;->c()Lcom/google/android/gms/oss/licenses/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->D:LG3/e;

    new-instance v2, Lcom/google/android/gms/oss/licenses/h;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/oss/licenses/h;-><init>(Lcom/google/android/gms/oss/licenses/j;LG3/e;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/d;->g(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->I:Lcom/google/android/gms/tasks/Task;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->N:Lcom/google/android/gms/oss/licenses/b;

    invoke-virtual {v0}, Lcom/google/android/gms/oss/licenses/b;->c()Lcom/google/android/gms/oss/licenses/j;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/oss/licenses/f;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/oss/licenses/f;-><init>(Lcom/google/android/gms/oss/licenses/j;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/d;->g(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->J:Lcom/google/android/gms/tasks/Task;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/oss/licenses/d;

    invoke-direct {v0, p0}, Lcom/google/android/gms/oss/licenses/d;-><init>(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
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

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    const-string v0, "scroll_pos"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->H:I

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lc/j;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Landroid/widget/ScrollView;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Landroid/widget/ScrollView;

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    const-string v1, "scroll_pos"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method
