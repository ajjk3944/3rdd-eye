.class final LG6/A$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field private final a:LG6/A$c;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>(LG6/A$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LG6/A$f;->a:LG6/A$c;

    return-void
.end method

.method synthetic constructor <init>(LG6/A$c;LG6/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG6/A$f;-><init>(LG6/A$c;)V

    return-void
.end method


# virtual methods
.method public a()LI6/a;
    .locals 4

    iget-object v0, p0, LG6/A$f;->b:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ly2/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LG6/A$g;

    iget-object v1, p0, LG6/A$f;->a:LG6/A$c;

    iget-object v2, p0, LG6/A$f;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LG6/A$g;-><init>(LG6/A$c;Ljava/lang/String;LG6/A$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/String;)LI6/a$a;
    .locals 0

    invoke-virtual {p0, p1}, LG6/A$f;->c(Ljava/lang/String;)LG6/A$f;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)LG6/A$f;
    .locals 0

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LG6/A$f;->b:Ljava/lang/String;

    return-object p0
.end method
