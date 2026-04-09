.class public final LC/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/o$a;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lmh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;Lmh/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/l;->a:Lmh/l;

    iput-object p2, p0, LC/l;->b:Lmh/r;

    return-void
.end method


# virtual methods
.method public final a()Lmh/r;
    .locals 1

    iget-object v0, p0, LC/l;->b:Lmh/r;

    return-object v0
.end method

.method public getKey()Lmh/l;
    .locals 1

    iget-object v0, p0, LC/l;->a:Lmh/l;

    return-object v0
.end method
