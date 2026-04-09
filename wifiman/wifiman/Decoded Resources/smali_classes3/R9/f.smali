.class public final LR9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/p;)V
    .locals 1

    const-string/jumbo v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9/f;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    iget-object v0, p0, LR9/f;->a:Lmh/p;

    return-object v0
.end method
