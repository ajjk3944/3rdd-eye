.class final LG6/A$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LG6/A$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LG6/A$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LG6/a;
    .locals 3

    iget-object v0, p0, LG6/A$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ly2/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LG6/A$c;

    iget-object v1, p0, LG6/A$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG6/A$c;-><init>(Landroid/content/Context;LG6/A$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Landroid/content/Context;)LG6/a$a;
    .locals 0

    invoke-virtual {p0, p1}, LG6/A$b;->c(Landroid/content/Context;)LG6/A$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)LG6/A$b;
    .locals 0

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, LG6/A$b;->a:Landroid/content/Context;

    return-object p0
.end method
