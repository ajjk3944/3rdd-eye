.class LLg/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLg/l;->s1(JLLg/h;LLg/l$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LLg/m$a;

.field final synthetic b:LKg/c;

.field final synthetic c:LLg/l;


# direct methods
.method constructor <init>(LLg/l;LLg/m$a;LKg/c;)V
    .locals 0

    iput-object p1, p0, LLg/l$e;->c:LLg/l;

    iput-object p2, p0, LLg/l$e;->a:LLg/m$a;

    iput-object p3, p0, LLg/l$e;->b:LKg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LLg/l$e;->a:LLg/m$a;

    iget-object v1, p0, LLg/l$e;->b:LKg/c;

    invoke-virtual {v0, v1}, LLg/m$a;->e(LKg/c;)V

    return-void
.end method
