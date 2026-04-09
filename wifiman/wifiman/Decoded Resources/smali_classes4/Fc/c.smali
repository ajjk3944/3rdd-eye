.class public final synthetic LFc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LFc/a$b;


# direct methods
.method public synthetic constructor <init>(LFc/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFc/c;->a:LFc/a$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFc/c;->a:LFc/a$b;

    invoke-static {v0}, LFc/a$b;->h(LFc/a$b;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    return-object v0
.end method
