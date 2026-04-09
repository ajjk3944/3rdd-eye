.class public final synthetic LIf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIf/e;

.field public final synthetic b:LIf/d;

.field public final synthetic c:LC/C;


# direct methods
.method public synthetic constructor <init>(LIf/e;LIf/d;LC/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/j;->a:LIf/e;

    iput-object p2, p0, LIf/j;->b:LIf/d;

    iput-object p3, p0, LIf/j;->c:LC/C;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LIf/j;->a:LIf/e;

    iget-object v1, p0, LIf/j;->b:LIf/d;

    iget-object v2, p0, LIf/j;->c:LC/C;

    invoke-static {v0, v1, v2}, LIf/m;->d(LIf/e;LIf/d;LC/C;)LYg/J;

    move-result-object v0

    return-object v0
.end method
