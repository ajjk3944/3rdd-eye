.class public final LQ/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ/j;->a:I

    iput p2, p0, LQ/j;->b:I

    iput p3, p0, LQ/j;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LQ/j;->c:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LQ/j;->a:I

    return v0
.end method
