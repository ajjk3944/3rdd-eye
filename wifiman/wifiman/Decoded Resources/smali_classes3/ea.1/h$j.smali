.class final Lea/h$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/h;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lea/h;


# direct methods
.method constructor <init>(Lea/h;)V
    .locals 0

    iput-object p1, p0, Lea/h$j;->a:Lea/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lea/h$j;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process resend verification email stream"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lea/h$j;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lea/j;

    invoke-direct {v0}, Lea/j;-><init>()V

    invoke-static {v0, p1}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lea/h$j;->a:Lea/h;

    invoke-virtual {p1}, Lea/h;->g0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method
