.class final LRh/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRh/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lri/i;

.field private final b:LJh/E;

.field private final c:Lri/n;


# direct methods
.method public constructor <init>(Lri/i;LJh/E;Lri/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/d$a;->a:Lri/i;

    iput-object p2, p0, LRh/d$a;->b:LJh/E;

    iput-object p3, p0, LRh/d$a;->c:Lri/n;

    return-void
.end method


# virtual methods
.method public final a()LJh/E;
    .locals 1

    iget-object v0, p0, LRh/d$a;->b:LJh/E;

    return-object v0
.end method

.method public final b()Lri/i;
    .locals 1

    iget-object v0, p0, LRh/d$a;->a:Lri/i;

    return-object v0
.end method

.method public final c()Lri/n;
    .locals 1

    iget-object v0, p0, LRh/d$a;->c:Lri/n;

    return-object v0
.end method
