.class public abstract Lr/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lr/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lr/E;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lr/S;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lr/S;->b:Lr/E;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lr/S;-><init>(Ljava/lang/Object;Lr/E;)V

    return-void
.end method


# virtual methods
.method public final a()Lr/E;
    .locals 1

    iget-object v0, p0, Lr/S;->b:Lr/E;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/S;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lr/E;)V
    .locals 0

    iput-object p1, p0, Lr/S;->b:Lr/E;

    return-void
.end method
