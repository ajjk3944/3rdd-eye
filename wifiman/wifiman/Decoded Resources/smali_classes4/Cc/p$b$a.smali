.class public final LCc/p$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p$b;-><init>(La8/b;Ljava/util/TreeSet;LDc/j;Lwc/a;Lcom/ui/wifiman/model/bluetooth/le/a$a;LCc/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lle/i;

    invoke-virtual {p1}, Lle/i;->e()Lh9/a;

    move-result-object p1

    check-cast p2, Lle/i;

    invoke-virtual {p2}, Lle/i;->e()Lh9/a;

    move-result-object p2

    invoke-static {p1, p2}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
