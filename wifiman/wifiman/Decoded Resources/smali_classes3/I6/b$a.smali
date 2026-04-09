.class LI6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/b;->b(LJ5/b;)LK6/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ5/b;


# direct methods
.method constructor <init>(LJ5/b;)V
    .locals 0

    iput-object p1, p0, LI6/b$a;->a:LJ5/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/N$b;)V
    .locals 1

    iget-object v0, p0, LI6/b$a;->a:LJ5/b;

    invoke-virtual {v0, p1}, LJ5/b;->accept(Ljava/lang/Object;)V

    return-void
.end method
