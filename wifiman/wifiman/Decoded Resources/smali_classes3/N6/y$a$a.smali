.class LN6/y$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN6/y$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$a;


# direct methods
.method constructor <init>(LN6/y$a;)V
    .locals 0

    iput-object p1, p0, LN6/y$a$a;->a:LN6/y$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LN6/o;)Lgg/s;
    .locals 0

    iget-object p1, p0, LN6/y$a$a;->a:LN6/y$a;

    iget-object p1, p1, LN6/y$a;->b:Lgg/s;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN6/o;

    invoke-virtual {p0, p1}, LN6/y$a$a;->a(LN6/o;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
