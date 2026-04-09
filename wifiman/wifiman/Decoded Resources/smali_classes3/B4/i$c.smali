.class LB4/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/i$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:LB4/j;


# direct methods
.method private constructor <init>(LB4/j;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LB4/i$c;->a:LB4/j;

    return-void
.end method

.method synthetic constructor <init>(LB4/j;LB4/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LB4/i$c;-><init>(LB4/j;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LB4/i$c;->a:LB4/j;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, LB4/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
