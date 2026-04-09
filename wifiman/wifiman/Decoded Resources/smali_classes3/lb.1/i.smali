.class public final synthetic Llb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LYi/e;


# direct methods
.method public synthetic constructor <init>(LYi/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/i;->a:LYi/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llb/i;->a:LYi/e;

    invoke-static {v0}, Llb/h$c;->h(LYi/e;)Laj/i;

    move-result-object v0

    return-object v0
.end method
