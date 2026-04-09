.class LAh/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LAh/u;


# direct methods
.method public constructor <init>(LAh/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/n;->a:LAh/u;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAh/n;->a:LAh/u;

    check-cast p1, LYg/s;

    invoke-static {v0, p1}, LAh/u;->h(LAh/u;LYg/s;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1
.end method
