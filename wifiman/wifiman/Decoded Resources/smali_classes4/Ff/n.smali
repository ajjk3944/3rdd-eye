.class public final synthetic LFf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LFf/e;

.field public final synthetic b:LGf/i;


# direct methods
.method public synthetic constructor <init>(LFf/e;LGf/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFf/n;->a:LFf/e;

    iput-object p2, p0, LFf/n;->b:LGf/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LFf/n;->a:LFf/e;

    iget-object v1, p0, LFf/n;->b:LGf/i;

    invoke-static {v0, v1}, LFf/i$b$a$a;->c(LFf/e;LGf/i;)LYg/J;

    move-result-object v0

    return-object v0
.end method
