.class public final LM/J;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Float;


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


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LM/J;->a:Ljava/lang/Float;

    return-object v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LM/J;->a:Ljava/lang/Float;

    return-void
.end method

.method public final c(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LM/J;->a:Ljava/lang/Float;

    return-void
.end method
