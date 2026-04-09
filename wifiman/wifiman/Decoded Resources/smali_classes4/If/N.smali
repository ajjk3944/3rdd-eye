.class public final synthetic LIf/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIf/b;


# direct methods
.method public synthetic constructor <init>(LIf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/N;->a:LIf/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LIf/N;->a:LIf/b;

    invoke-static {v0}, LIf/P;->b(LIf/b;)LYg/J;

    move-result-object v0

    return-object v0
.end method
