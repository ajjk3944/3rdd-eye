.class public final LGb/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGb/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LGb/d;

.field private final b:LGb/i$b;


# direct methods
.method public constructor <init>(LGb/d;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGb/i$c;->a:LGb/d;

    new-instance p1, LGb/i$b;

    invoke-direct {p1}, LGb/i$b;-><init>()V

    iput-object p1, p0, LGb/i$c;->b:LGb/i$b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGb/i$c;->b:LGb/i$b;

    invoke-virtual {v0, p1, p2}, LGb/i$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LGb/i$c;->a:LGb/d;

    invoke-interface {v0, p1, p2}, LGb/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGb/i$c;->b:LGb/i$b;

    invoke-virtual {v0, p1}, LGb/i$b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LGb/i$c;->a:LGb/d;

    invoke-interface {v0, p1}, LGb/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LGb/i$c;->b:LGb/i$b;

    invoke-virtual {v1, p1, v0}, LGb/i$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LGb/i$c;->b:LGb/i$b;

    invoke-virtual {v0}, LGb/i$b;->c()V

    return-void
.end method
