.class LM6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/c;->b(Lgg/t;LO6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO6/i;

.field final synthetic b:LM6/c;


# direct methods
.method constructor <init>(LM6/c;LO6/i;)V
    .locals 0

    iput-object p1, p0, LM6/c$a;->b:LM6/c;

    iput-object p2, p0, LM6/c$a;->a:LO6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, LM6/c$a;->a:LO6/i;

    invoke-interface {v0}, LO6/i;->release()V

    return-void
.end method
