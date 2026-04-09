.class public final synthetic Lye/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LLi/g;


# direct methods
.method public synthetic constructor <init>(LLi/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/f;->a:LLi/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lye/f;->a:LLi/g;

    invoke-static {v0}, Lye/g;->X(LLi/g;)LLi/g;

    move-result-object v0

    return-object v0
.end method
