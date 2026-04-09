.class Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_ja;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JaTimeFormat"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I


# direct methods
.method public constructor <init>(Ljava/util/ResourceBundle;LAj/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->a:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->b:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->d:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->f:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->g:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->i:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->j:Ljava/lang/String;

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k:Ljava/lang/String;

    const/16 v0, 0x32

    iput v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->l:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Pattern"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->t(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FuturePrefix"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->m(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FutureSuffix"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->o(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastPrefix"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->q(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastSuffix"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->s(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "SingularName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->v(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->u(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FuturePluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->l(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FutureSingularName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->n(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastPluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->p(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k(LAj/g;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "PastSingularName"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->r(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p3, p4}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->f(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "%s"

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "%n"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v0, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "%u"

    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private d(LAj/a;Z)Ljava/lang/String;
    .locals 6

    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->i(LAj/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e(LAj/a;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h(LAj/a;Z)J

    move-result-wide v2

    invoke-interface {p1}, LAj/a;->a()LAj/g;

    move-result-object p2

    instance-of p2, p2, Lorg/ocpsoft/prettytime/units/Decade;

    if-eqz p2, :cond_0

    const-wide/16 v4, 0xa

    mul-long/2addr v2, v4

    :cond_0
    invoke-interface {p1}, LAj/a;->a()LAj/g;

    move-result-object p1

    instance-of p1, p1, Lorg/ocpsoft/prettytime/units/Millennium;

    if-eqz p1, :cond_1

    const-wide/16 p1, 0x3e8

    mul-long/2addr v2, p1

    :cond_1
    invoke-direct {p0, v0, v1, v2, v3}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g(LAj/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->d:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->f:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->f:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->b:Ljava/lang/String;

    return-object p1
.end method

.method private i(LAj/a;)Ljava/lang/String;
    .locals 4

    invoke-interface {p1}, LAj/a;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const-string p1, "-"

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private j(LAj/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->a:Ljava/lang/String;

    return-object p1
.end method

.method private k(LAj/g;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(LAj/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->j:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->i:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\s+"

    const-string v0, " "

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(LAj/a;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->d(LAj/a;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected e(LAj/a;Z)Ljava/lang/String;
    .locals 5

    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->j(LAj/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h(LAj/a;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h(LAj/a;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long p2, v1, v3

    if-lez p2, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->g(LAj/a;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method protected f(J)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->g:Ljava/lang/String;

    return-object p1
.end method

.method protected h(LAj/a;Z)J
    .locals 0

    if-eqz p2, :cond_0

    iget p2, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->l:I

    invoke-interface {p1, p2}, LAj/a;->d(I)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LAj/a;->c()J

    move-result-wide p1

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public l(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->d:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->c:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->i:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->f:Ljava/lang/String;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->j:Ljava/lang/String;

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->e:Ljava/lang/String;

    return-object p0
.end method

.method public s(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k:Ljava/lang/String;

    return-object p0
.end method

.method public t(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->g:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JaTimeFormat [pattern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futurePrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futureSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastPrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", roundingTolerance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->b:Ljava/lang/String;

    return-object p0
.end method

.method public v(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    .locals 0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;->a:Ljava/lang/String;

    return-object p0
.end method
