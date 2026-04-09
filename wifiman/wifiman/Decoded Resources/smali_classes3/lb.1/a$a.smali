.class public final synthetic Llb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Llb/a$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llb/a$a;

    invoke-direct {v0}, Llb/a$a;-><init>()V

    sput-object v0, Llb/a$a;->a:Llb/a$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.CloudConfig"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "unifiCloudAccess"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Llb/a$a;->descriptor:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LXi/f;
    .locals 1

    sget-object v0, Llb/a$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llb/a$a;->g(LYi/e;)Llb/a;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LVi/b;

    sget-object v1, Llb/o$a;->a:Llb/o$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Llb/a;

    invoke-virtual {p0, p1, p2}, Llb/a$a;->h(LYi/f;Llb/a;)V

    return-void
.end method

.method public final g(LYi/e;)Llb/a;
    .locals 9

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb/a$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Llb/o$a;->a:Llb/o$a;

    invoke-interface {p1, v0, v3, v1, v4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb/o;

    goto :goto_1

    :cond_0
    move v5, v2

    move v6, v3

    move-object v1, v4

    :goto_0
    if-eqz v5, :cond_3

    invoke-interface {p1, v0}, LYi/c;->k(LXi/f;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_2

    if-nez v7, :cond_1

    sget-object v6, Llb/o$a;->a:Llb/o$a;

    invoke-interface {p1, v0, v3, v6, v1}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb/o;

    move v6, v2

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    move v5, v3

    goto :goto_0

    :cond_3
    move v2, v6

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    new-instance p1, Llb/a;

    invoke-direct {p1, v2, v1, v4}, Llb/a;-><init>(ILlb/o;LZi/R0;)V

    return-object p1
.end method

.method public final h(LYi/f;Llb/a;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb/a$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Llb/a;->b(Llb/a;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
