.class public final synthetic LIf/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIf/a;

.field public final synthetic b:LIf/b;


# direct methods
.method public synthetic constructor <init>(LIf/a;LIf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/M;->a:LIf/a;

    iput-object p2, p0, LIf/M;->b:LIf/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LIf/M;->a:LIf/a;

    iget-object v1, p0, LIf/M;->b:LIf/b;

    invoke-static {v0, v1}, LIf/P;->c(LIf/a;LIf/b;)LYg/J;

    move-result-object v0

    return-object v0
.end method
