.class LN6/y$a$b;
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

    iput-object p1, p0, LN6/y$a$b;->a:LN6/y$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lgg/s;->R0(J)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LN6/y$a$b;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
