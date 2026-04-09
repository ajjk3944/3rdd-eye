.class final Lhb/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLGb/f;Llb/c;Ljb/a;Ljb/i;Leb/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;


# direct methods
.method constructor <init>(Lhb/c;)V
    .locals 0

    iput-object p1, p0, Lhb/c$h;->a:Lhb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/u;)V
    .locals 20

    move-object/from16 v0, p1

    const-string/jumbo v1, "webRtcClient"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lhb/c$h;->a:Lhb/c;

    invoke-static {v2}, Lhb/c;->t(Lhb/c;)LHg/a;

    move-result-object v2

    new-instance v3, Lhb/e;

    new-instance v15, Lmb/n;

    const/16 v16, 0x7ff

    const/16 v17, 0x0

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

    const/16 v18, 0x0

    move-object v4, v15

    move-object/from16 v19, v15

    move-object/from16 v15, v18

    invoke-direct/range {v4 .. v17}, Lmb/n;-><init>(ZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v19

    invoke-direct {v3, v0, v4}, Lhb/e;-><init>(Ltb/u;Lmb/x;)V

    invoke-virtual {v2, v3}, LHg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltb/u;

    invoke-virtual {p0, p1}, Lhb/c$h;->a(Ltb/u;)V

    return-void
.end method
