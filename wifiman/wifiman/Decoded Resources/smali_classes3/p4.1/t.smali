.class public final Lp4/t;
.super Lp4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/t$b;
    }
.end annotation


# instance fields
.field private final a:Lp4/v;

.field private final b:LC4/b;

.field private final c:LC4/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lp4/v;LC4/b;LC4/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp4/b;-><init>()V

    .line 3
    iput-object p1, p0, Lp4/t;->a:Lp4/v;

    .line 4
    iput-object p2, p0, Lp4/t;->b:LC4/b;

    .line 5
    iput-object p3, p0, Lp4/t;->c:LC4/a;

    .line 6
    iput-object p4, p0, Lp4/t;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lp4/v;LC4/b;LC4/a;Ljava/lang/Integer;Lp4/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lp4/t;-><init>(Lp4/v;LC4/b;LC4/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Lp4/t$b;
    .locals 2

    new-instance v0, Lp4/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp4/t$b;-><init>(Lp4/t$a;)V

    return-object v0
.end method
