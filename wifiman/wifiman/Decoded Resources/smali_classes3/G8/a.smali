.class public final synthetic LG8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LG8/b;


# direct methods
.method public synthetic constructor <init>(LG8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/a;->a:LG8/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LG8/a;->a:LG8/b;

    invoke-static {v0}, LG8/b;->o0(LG8/b;)LLi/g;

    move-result-object v0

    return-object v0
.end method
