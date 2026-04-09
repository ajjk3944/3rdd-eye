.class final LV8/k$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->N(LG6/N;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/k$A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$A;

    invoke-direct {v0}, LV8/k$A;-><init>()V

    sput-object v0, LV8/k$A;->a:LV8/k$A;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    new-instance v0, LV8/k$A$a;

    invoke-direct {v0, p1}, LV8/k$A$a;-><init>(I)V

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LV8/k$A;->a(I)V

    return-void
.end method
