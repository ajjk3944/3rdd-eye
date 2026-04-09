.class LLg/l$f;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLg/l;->c1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LLg/l;


# direct methods
.method constructor <init>(LLg/l;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LLg/l$f;->a:LLg/l;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, LLg/l$f;->a:LLg/l;

    invoke-virtual {v0}, LLg/l;->q0()V

    return-void
.end method
