.class public final Lv1/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:[Lv1/e$d;


# direct methods
.method public constructor <init>([Lv1/e$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/e$c;->a:[Lv1/e$d;

    return-void
.end method


# virtual methods
.method public a()[Lv1/e$d;
    .locals 1

    iget-object v0, p0, Lv1/e$c;->a:[Lv1/e$d;

    return-object v0
.end method
