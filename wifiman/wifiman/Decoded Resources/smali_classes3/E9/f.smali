.class public final LE9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lmh/p;

.field private b:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LE9/f;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LE9/f;->a(Ljava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    iget-object v0, p0, LE9/f;->a:Lmh/p;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LE9/f;->b:Lmh/a;

    return-void
.end method

.method public final d(Lmh/p;)V
    .locals 0

    iput-object p1, p0, LE9/f;->a:Lmh/p;

    return-void
.end method
