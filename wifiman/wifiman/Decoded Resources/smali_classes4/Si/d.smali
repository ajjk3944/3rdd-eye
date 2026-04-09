.class public final LSi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSi/c;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lmh/q;

.field private final c:Lmh/q;

.field private final d:Lmh/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lmh/q;Lmh/q;Lmh/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LSi/d;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LSi/d;->b:Lmh/q;

    .line 4
    iput-object p3, p0, LSi/d;->c:Lmh/q;

    .line 5
    iput-object p4, p0, LSi/d;->d:Lmh/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lmh/q;Lmh/q;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LSi/d;-><init>(Ljava/lang/Object;Lmh/q;Lmh/q;Lmh/q;)V

    return-void
.end method
