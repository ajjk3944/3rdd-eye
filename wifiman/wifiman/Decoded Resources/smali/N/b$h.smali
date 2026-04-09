.class public final LN/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LN/b$h$b;

.field final synthetic b:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 1

    iput-object p1, p0, LN/b$h;->b:LN/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LN/b$h$b;

    invoke-direct {v0, p1}, LN/b$h$b;-><init>(LN/b;)V

    iput-object v0, p0, LN/b$h;->a:LN/b$h$b;

    return-void
.end method

.method public static final synthetic c(LN/b$h;)LN/b$h$b;
    .locals 0

    iget-object p0, p0, LN/b$h;->a:LN/b$h$b;

    return-object p0
.end method


# virtual methods
.method public a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LN/b$h;->b:LN/b;

    new-instance v1, LN/b$h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, v2}, LN/b$h$a;-><init>(LN/b$h;Lmh/p;Ldh/e;)V

    invoke-virtual {v0, p1, v1, p3}, LN/b;->j(Ls/L;Lmh/q;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
