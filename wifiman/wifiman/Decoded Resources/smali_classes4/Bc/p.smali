.class public final LBc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBc/a;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LBc/a$b$b$d;->a:LBc/a$b$b$d;

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    const-string v2, "just(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LBc/p;->a:Lgg/i;

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LBc/p;->b:Lgg/i;

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LBc/p;->c:Lgg/i;

    new-instance v0, LBc/a$a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v3, v1}, LBc/a$a;-><init>(Ljava/lang/String;LV7/a;LV7/b;Ljava/util/List;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LBc/p;->d:Lgg/i;

    new-instance v0, LBc/a$a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v3, v3, v3, v1}, LBc/a$a;-><init>(Ljava/lang/String;LV7/a;LV7/b;Ljava/util/List;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LBc/p;->e:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/p;->a:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/p;->d:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/p;->e:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/p;->c:Lgg/i;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/p;->b:Lgg/i;

    return-object v0
.end method
