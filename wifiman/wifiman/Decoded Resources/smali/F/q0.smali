.class public final LF/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LF/q0;->a:I

    iput p2, p0, LF/q0;->b:I

    iput-object p3, p0, LF/q0;->c:Lmh/a;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LF/q0;->b:I

    return v0
.end method

.method public final b()Lmh/a;
    .locals 1

    iget-object v0, p0, LF/q0;->c:Lmh/a;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LF/q0;->a:I

    return v0
.end method
