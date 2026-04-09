.class public LG6/B$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;

.field private f:LG6/B$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LG6/B;
    .locals 8

    new-instance v7, LG6/B;

    iget-object v1, p0, LG6/B$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, LG6/B$a;->b:Ljava/lang/Integer;

    iget-object v3, p0, LG6/B$a;->c:Ljava/lang/Integer;

    iget-object v4, p0, LG6/B$a;->d:Ljava/lang/Boolean;

    iget-object v5, p0, LG6/B$a;->e:Ljava/lang/Boolean;

    iget-object v6, p0, LG6/B$a;->f:LG6/B$b;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LG6/B;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;LG6/B$b;)V

    return-object v7
.end method

.method public b(Ljava/lang/Integer;)LG6/B$a;
    .locals 0

    iput-object p1, p0, LG6/B$a;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public c(LG6/B$b;)LG6/B$a;
    .locals 0

    iput-object p1, p0, LG6/B$a;->f:LG6/B$b;

    return-object p0
.end method
