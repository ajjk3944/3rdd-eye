.class public final Lj0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/h;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lj0/h;->a:Lmh/l;

    return-object v0
.end method
