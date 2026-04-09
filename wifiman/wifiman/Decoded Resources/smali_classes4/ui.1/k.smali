.class public abstract Lui/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui/k$a;,
        Lui/k$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui/k;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lui/k;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lui/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lui/f$a;->a(Lui/f;LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
