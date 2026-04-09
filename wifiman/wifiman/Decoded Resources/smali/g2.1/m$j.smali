.class final Lg2/m$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lg2/m$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg2/m$j;

    invoke-direct {v0}, Lg2/m$j;-><init>()V

    sput-object v0, Lg2/m$j;->a:Lg2/m$j;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    invoke-virtual {p0, p1}, Lg2/m$j;->a(Lf2/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
