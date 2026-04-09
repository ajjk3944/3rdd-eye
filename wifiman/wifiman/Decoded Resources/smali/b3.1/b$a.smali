.class final Lb3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final a:Lb3/b$a;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;

.field private static final h:LZ4/b;

.field private static final i:LZ4/b;

.field private static final j:LZ4/b;

.field private static final k:LZ4/b;

.field private static final l:LZ4/b;

.field private static final m:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/b$a;

    invoke-direct {v0}, Lb3/b$a;-><init>()V

    sput-object v0, Lb3/b$a;->a:Lb3/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->b:LZ4/b;

    const-string v0, "model"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->c:LZ4/b;

    const-string v0, "hardware"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->d:LZ4/b;

    const-string v0, "device"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->e:LZ4/b;

    const-string v0, "product"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->f:LZ4/b;

    const-string v0, "osBuild"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->g:LZ4/b;

    const-string v0, "manufacturer"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->h:LZ4/b;

    const-string v0, "fingerprint"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->i:LZ4/b;

    const-string v0, "locale"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->j:LZ4/b;

    const-string v0, "country"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->k:LZ4/b;

    const-string v0, "mccMnc"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->l:LZ4/b;

    const-string v0, "applicationBuild"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$a;->m:LZ4/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb3/a;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lb3/b$a;->b(Lb3/a;LZ4/d;)V

    return-void
.end method

.method public b(Lb3/a;LZ4/d;)V
    .locals 2

    sget-object v0, Lb3/b$a;->b:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->c:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->d:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->e:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->f:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->g:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->h:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->i:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->j:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->k:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->l:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$a;->m:LZ4/b;

    invoke-virtual {p1}, Lb3/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
