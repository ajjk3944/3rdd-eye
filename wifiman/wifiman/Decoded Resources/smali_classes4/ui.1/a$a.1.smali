.class public abstract Lui/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lui/a$a;->a:I

    return-void
.end method


# virtual methods
.method protected final c(Lui/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lui/a;->b()Lui/c;

    move-result-object p1

    iget v0, p0, Lui/a$a;->a:I

    invoke-virtual {p1, v0}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
