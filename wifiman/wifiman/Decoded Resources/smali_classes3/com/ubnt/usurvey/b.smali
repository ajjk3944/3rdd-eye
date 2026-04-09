.class public final Lcom/ubnt/usurvey/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/usurvey/a$b;


# instance fields
.field private a:Lcom/ubnt/usurvey/a;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 22

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v15, Lcom/ubnt/usurvey/a;

    move-object v1, v15

    const v19, 0x1ffff

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v15

    move/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v20}, Lcom/ubnt/usurvey/a;-><init>(ZZZZZZZLIa/a$b;ZZZZZZLAb/h;Lcb/a;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v21

    iput-object v1, v0, Lcom/ubnt/usurvey/b;->a:Lcom/ubnt/usurvey/a;

    invoke-virtual/range {p0 .. p0}, Lcom/ubnt/usurvey/b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v1

    invoke-static {v1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "just(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ubnt/usurvey/b;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public a(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "updater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "app configuration update in production build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/b;->b:Lgg/i;

    return-object v0
.end method

.method public getConfig()Lcom/ubnt/usurvey/a;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/b;->a:Lcom/ubnt/usurvey/a;

    return-object v0
.end method
