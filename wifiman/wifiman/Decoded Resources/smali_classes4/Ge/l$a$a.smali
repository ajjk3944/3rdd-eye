.class final LGe/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGe/l$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LGe/g;


# direct methods
.method constructor <init>(Lmh/l;LGe/g;)V
    .locals 0

    iput-object p1, p0, LGe/l$a$a;->a:Lmh/l;

    iput-object p2, p0, LGe/l$a$a;->b:LGe/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LGe/l$a$a;->a:Lmh/l;

    iget-object v1, p0, LGe/l$a$a;->b:LGe/g;

    check-cast v1, LGe/a;

    invoke-virtual {v1}, LGe/a;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGe/l$a$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
