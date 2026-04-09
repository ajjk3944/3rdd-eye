.class public final LSi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSi/a;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lmh/q;

.field private final c:Lmh/q;

.field private final d:Lmh/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lmh/q;Lmh/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LSi/b;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LSi/b;->b:Lmh/q;

    .line 4
    iput-object p3, p0, LSi/b;->c:Lmh/q;

    .line 5
    invoke-static {}, LSi/f;->a()Lmh/q;

    move-result-object p1

    iput-object p1, p0, LSi/b;->d:Lmh/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lmh/q;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LSi/b;-><init>(Ljava/lang/Object;Lmh/q;Lmh/q;)V

    return-void
.end method
