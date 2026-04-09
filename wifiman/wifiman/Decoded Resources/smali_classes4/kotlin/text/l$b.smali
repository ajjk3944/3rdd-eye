.class public final Lkotlin/text/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/text/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lkotlin/text/l;


# direct methods
.method public constructor <init>(Lkotlin/text/l;)V
    .locals 1

    const-string v0, "match"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/l$b;->a:Lkotlin/text/l;

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/text/l;
    .locals 1

    iget-object v0, p0, Lkotlin/text/l$b;->a:Lkotlin/text/l;

    return-object v0
.end method
