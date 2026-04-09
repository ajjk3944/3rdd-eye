.class final synthetic LC0/b$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:LC0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC0/b$a;

    invoke-direct {v0}, LC0/b$a;-><init>()V

    sput-object v0, LC0/b$a;->a:LC0/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "min(II)I"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Loh/b;

    const-string v3, "min"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(II)Ljava/lang/Integer;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC0/b$a;->a(II)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
